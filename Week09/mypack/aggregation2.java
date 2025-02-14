package Week09.mypack;

class animal{
    animal(String tp){
        System.out.println(tp);
    }
}

class zoo{
    String animalname;

    zoo(String name, animal animalType){
        System.out.println(name);
        this.animalName = name;
    }

}

public class aggregation2 {
    public static void main(String[] args) {
        animal category = new animal("-- Predators --");
        zoo myvisit = new zoo("Tiger", category);
    }
}








public class aggregation2 {
    
}
