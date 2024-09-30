package hw.hw4;



public class Main {
    static int curYear = 2024;
    public String secondName;
    public String firstName;
    public String patronim;
    int dateOfBirth;
    String eMail;

    public Main(String secondName, String firstName, String patronim, int dateOfBirth, String eMail) {
        this.secondName=secondName;
        this.firstName=firstName;
        this.patronim=patronim;
        this.dateOfBirth=dateOfBirth;
        this.eMail=eMail;
    }

    public static void main(String[] args) {

        Main [] Main  = new Main[10];
        Main[0] = new Main("A","B","N",2010,"am@em.com");
        Main[1] = new Main("A","B","N",2020,"am@em.com");
        Main[2] = new Main("A","B","N",2000,"am@em.com");
        Main[3] = new Main("K","B","N",1888,"am@em.com");
        Main[4] = new Main("A","B","N",1999,"am@em.com");
        Main[5] = new Main("A","B","N",1988,"am@em.com");
        Main[6] = new Main("K","B","N",1930,"am@em.com");
        Main[7] = new Main("K","B","N",1952,"am@em.com");
        Main[8] = new Main("K","B","N",1969,"am@em.com");
        Main[9] = new Main("K","B","N",1957,"am@em.com");
        for (int i=0; i<Main.length;i++){
            int age;
            age=curYear-Main[i].dateOfBirth;
            if (age>40){
                System.out.println(Main[i].secondName +" "+ Main[i].firstName +" "+  Main[i].patronim +" "+ Main[i].dateOfBirth +" "+ Main[i].eMail);
            }
        }
        }
    }

