public class Person {
   private String name;
   private int age;
   private String gender;
   private String address;
   private String phone;

   public Person(String name, int age, String gender, String address, String phone) {
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.address=address;
       this.phone=phone;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name=name;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;

   }
   public String getGender(){
       return gender;
   }
   public void setGender(String gender){
       this.gender=gender;
   }

   public String getAddress(){
       return address;
   }
   public void setAddress(String address){
       this.address=address;
   }
   public String getPhone(){
       return phone;
   }
   public void setPhone(String phone){
       this.phone=phone;
   }
   public String toString(){
       return "Name"+name+"Age"+age+"Gender"+gender+
               "/Address"+address+"Phone"+phone;
   }
   public void updateContactInfo(String newAddress,String newPhone){
       this.address=newAddress;
       this.phone=newPhone;
   }
   public void sendNotification(String message){
       System.out.println("Notification to"+name+":"+message);
   }


}
