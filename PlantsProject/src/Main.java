public class Main {
    public static void main(String[] args) {
        Plant[] plants=new Plant[10];

       Plant p1=new Flower("Rose","Read", true,true);

       Plant p2=new Flower("Orchit","Blue", true,false);

       Plant p3=new Flower("Water Lily","White", false,false);



        add(plants,p1);
        add(plants,p2);
        add(plants,p3);
        System.out.println("Added Deta successfully");

        System.out.println("Search Data");
        search(plants,"Rose");

        System.out.println("Display Array");
        display(plants);

        remove(plants,"Rose");
        System.out.println("Remove Successfullay");

        System.out.println("Finally Display");
        display(plants);


    }
    public static void add(Plant[] plants,Plant p){
        for(int i=0;i<plants.length;i++){
            if(plants[i]==null){
                plants[i]=p;
                break;
            }
        }

    }
    public static void remove(Plant[] plants,String n){
        for(int i=0;plants[i]!=null &&i<plants.length;i++){
            if(plants[i].getName().equals(n)){
                plants[i]=plants[i+1];

            }
        }
    }
    public static Plant search(Plant[] plants,String n){
        for(int i=0;plants[i]!=null &&i<plants.length;i++){
            if(plants[i].getName().equals(n)){
                System.out.println(plants[i].getName()+" FOUND");
                return plants[i];
            }
        }
        return null;
    }
    public static void display(Plant[] plants){
        for(int i=0; plants[i]!=null&&i<plants.length;i++){
            System.out.println(plants[i]);
        }
    }
}
