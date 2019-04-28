package sss;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class yuangong {
	private String xingming;
	private Date age;
	private int bianhao;
	private String xingbie;
	public yuangong(String xingming, Date age, int bianhao, String xingbie) {
		super();
		this.xingming = xingming;
		this.age = age;
		this.bianhao = bianhao;
		this.xingbie = xingbie;
	}
	public yuangong() {
		// TODO Auto-generated constructor stub
	}
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public int nian(){
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		c.setTime(age);
		int sr=c.get(Calendar.YEAR);
		return year-sr;
	}
	public String toString() {
		SimpleDateFormat csrq=new SimpleDateFormat("yyyy-MM-dd");
		return "姓名为:" + xingming + ",生日为:" + csrq.format(age) + ",工号为:"
				+ bianhao + ",性别为:" + xingbie+",年龄为"+nian()+ "岁。";
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public int getBianhao() {
		return bianhao;
	}
	public void setBianhao(int bianhao) {
		this.bianhao = bianhao;
	}
	public String getXingbie() {
		return xingbie;
	}
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
}

