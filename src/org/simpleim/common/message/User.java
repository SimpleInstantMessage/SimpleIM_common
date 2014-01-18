package org.simpleim.common.message;

public class User{
      private  String id;
      private  String nikename;
      public User(){
    	  super();
      }
      public String getId(){
    	  return id;
      }
      public String getNikename(){
    	  return nikename;
      }
      public User setId(String id){
    	  this.id=id;
    	  return this;
      }
      public User setNikename(String nikename){
    	  this.nikename=nikename;
    	  return this;
      }
}
