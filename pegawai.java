public class pegawai {
    private String name;
    private String address;
    private int number;

    public pegawai (String name, String address, int number) {
        System.out.println("Menyusun Pegawai"); 
        this.name = name;
        this.address = address;
        this.number = number;
    }
 
    public void mailCheck() { // POLYMORPHISM
        System.out.println("Memeriksa surat untuk " + this.name + " " + this.address);
    }

    public String toString(){
        return name + " " + address + " " + number;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){

    }
}
