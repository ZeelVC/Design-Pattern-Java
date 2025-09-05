package com.example.creational_builder_pattern.WithoutBuilderPattern;

class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    //Constructor
    public House(String foundation,String structure,String roof, boolean hasGarage,boolean hasSwimmingPool,boolean hasGarden){
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = false;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
public class WithoutBuilderPattern {
    public static void main(String[] args) {
        House house = new House("Concrete","Wood","Shingles",true,true,false);
        //House house2 = new House("Concrete","Wood","Shingles");
        // Constructor Explosion -> Too Many Constructors
        // Difficult to understand and maintain this code
        // this is where builder pattern comes into picture
        System.out.println(house);
    }
}
