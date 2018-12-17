package datos;

public class DatosCombate {
private String[][] batalla1=new String [25][25];
private String[][] batalla2=new String [20][20];
private String[][] batalla3=new String [15][15];
private String[][] batalla4={ {"******","******","******","******","******","******","******","******","******","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							,{"**","      ","      ","      ","      ","      ","      ","      ","      ","******"}
							};
public String[][] getBatalla1() {
	return batalla1;
}
public void setBatalla1(String[][] batalla1) {
	this.batalla1 = batalla1;
}
public String[][] getBatalla2() {
	return batalla2;
}
public void setBatalla2(String[][] batalla2) {
	this.batalla2 = batalla2;
}
public String[][] getBatalla3() {
	return batalla3;
}
public void setBatalla3(String[][] batalla3) {
	this.batalla3 = batalla3;
}
public String[][] getBatalla4() {
	return batalla4;
}
public void setBatalla4(String[][] batalla4) {
	this.batalla4 = batalla4;
}


}
