package io.github.andersonlf.hbaseom.sample;

import io.github.andersonlf.hbaseom.dao.AbstractHBaseDao;

public class Main {

  public static void main(String[] args) {
    
//    Class<Person> obj = Person.class;
//    
//    if (obj.isAnnotationPresent(HBaseTable.class)) {
//      Annotation annotation = obj.getAnnotation(HBaseTable.class);
//      HBaseTable testerInfo = (HBaseTable) annotation;
//      System.out.println(testerInfo.name());
//      
//      for (Field f : obj.getDeclaredFields()) {
//        if (f.isAnnotationPresent(HBaseColumn.class)) {
//          Annotation annotation2 = f.getAnnotation(HBaseColumn.class);
//          HBaseColumn c2 = (HBaseColumn) annotation2;
//          
//          System.out.println(f.getType().getName() + "-" + c2.family() + "-" + c2.name());
//        }
//        
//        System.out.println(f.getType().getName());
//      }
//    }
    
//    List<String> myList =
//        Arrays.asList("a1", "a2", "b1", "c2", "c1");
//    
//    System.out.println(myList);
//
//    List<String> xpto = myList
//        .stream()
//        .filter(s -> s.startsWith("c"))
//        .map(String::toUpperCase)
//        .sorted()
//        .collect(Collectors.toList());
//    
//    System.out.println(myList);
//    System.out.println(xpto);
    
    long t = System.currentTimeMillis();
    AbstractHBaseDao<Person> dao = new PersonDao();
    System.out.println(System.currentTimeMillis() - t);
    
    t = System.currentTimeMillis();
    System.out.println(dao.getByKey("00000155000128-128849-9"));
    System.out.println(System.currentTimeMillis() - t);
    
    t = System.currentTimeMillis();
    System.out.println(dao.search("00000155000128"));
    System.out.println(System.currentTimeMillis() - t);
    
  }
}
