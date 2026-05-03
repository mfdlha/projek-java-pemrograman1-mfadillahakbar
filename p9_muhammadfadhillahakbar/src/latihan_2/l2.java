package latihan_2;

interface Lembaga {
    static final String Province = "Banten";
    static final String District = "Tangerang Selatan";

    public void setName(String Name);
    public void setAddress(String Address);
    public void setPhone(String Phone);
    public String getName();
    public String getAddress();
    public String getPhone();
}

interface Tingkat {
    public void setLevel(String level);
    public String getLevel();
}

class University implements Lembaga, Tingkat {
    String Name, Address, Phone, Level;
    public University(String Name, String Address, String Phone, String Level) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Level = Level;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public String getName(){
        return Name;
    }

    public String getAddress(){
        return Address;
    }

    public String getPhone(){
        return Phone;
    }

    public void setLevel(String Level){
        this.Level=Level;
    }

    public String getLevel(String Level){
        return Level;
    }

    public String toString(){
        return 
        "Name : "+Name+"\n"+
        "Level : "+Level+"\n"+
        "Address : "+Address+"\n"+
        "Phone : "+Phone+"\n"+
        "District : "+District+"\n"+ 
        "Province : "+Province;
    }
}

class SMA implements Lembaga, Tingkat {
    String Name, Address, Phone, Level;

    public SMA(String Name, String Address, String Phone, String Level) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Level = Level;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public String getName(){
        return Name;
    }

    
}