package DAOFactory;

public class Customer {
  int id;
  String name;
  String adress;
  public int getId() {
    return id;
  }
  @Override
  public String toString() {
    return "Customer [id=" + id + ", name=" + name + ", adress=" + adress + "]";
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAdress() {
    return adress;
  }
  public void setAdress(String adress) {
    this.adress = adress;
  }
}