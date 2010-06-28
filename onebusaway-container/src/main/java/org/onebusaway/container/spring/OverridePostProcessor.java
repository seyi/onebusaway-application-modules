package org.onebusaway.container.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

public class OverridePostProcessor implements BeanPostProcessor,
    PriorityOrdered {

  private Map<String, List<PropertyEntry>> _propertyEntriesByBeanName = new HashMap<String, List<PropertyEntry>>();

  private int _order = Ordered.LOWEST_PRECEDENCE - 2;

  public void setMap(Map<String, Object> map) {
    processMap(map);
  }

  public void setOrder(int order) {
    _order = order;
  }

  @Override
  public int getOrder() {
    return _order;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    List<PropertyEntry> entries = _propertyEntriesByBeanName.get(beanName);
    if (entries != null) {
      for (PropertyEntry entry : entries) {
        BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(bean);
        wrapper.setPropertyValue(entry.propertyName, entry.value);
      }
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    return bean;
  }

  private void processMap(Map<String, Object> map) {
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      String key = entry.getKey();
      int index = key.indexOf('.');
      if (index == -1)
        throw new IllegalArgumentException(
            "expected map key of form \"beanName.propertyName\" for " + key);
      String beanName = key.substring(0, index);
      String propertyName = key.substring(index + 1);
      List<PropertyEntry> entries = _propertyEntriesByBeanName.get(beanName);
      if (entries == null) {
        entries = new ArrayList<PropertyEntry>();
        _propertyEntriesByBeanName.put(beanName, entries);
      }
      entries.add(new PropertyEntry(propertyName, entry.getValue()));
    }
  }

  private static class PropertyEntry {
    public PropertyEntry(String propertyName, Object value) {
      this.propertyName = propertyName;
      this.value = value;
    }

    private String propertyName;
    private Object value;
  }
}
