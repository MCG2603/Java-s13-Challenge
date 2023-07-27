package employeeApp;

enum Plan {
    FULL(100, "TAM"), PARTİALLY(50, "YARİM");
    private int price;
    private String name;
    public void setPrice(int price) {
        this.price = price;
    }



    public void setName(String name) {
        this.name = name;
    }



    Plan(int price, String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

}
