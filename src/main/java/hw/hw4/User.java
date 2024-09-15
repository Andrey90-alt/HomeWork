package hw.hw4;



public class User {
    public String secondName;
    public String firstName;
    public String patronim;
    int dateOfBirth;
    String eMail;
    public String getSecondNameName() {
        return secondName;
    }
    public User(String secondName,String firstName, String patronim, int dateOfBirth, String eMail ){
        this.secondName=secondName;
        this.firstName=firstName;
        this.patronim=patronim;
        this.dateOfBirth=dateOfBirth;
        this.eMail=eMail;
    }
    public static void main(String[] args){
        User user=new User("A","B","N",2010,"am@em.com");
        System.out.println(user.secondName+" "+ user.firstName+" "+user.patronim);
        System.out.println(user.dateOfBirth);
        System.out.println(user.eMail);

    }



}
