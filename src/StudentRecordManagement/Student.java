package StudentRecordManagement;

public class Student {
	private int rollNo;
	private String name,cl,section,gender,mobileNo,city,state,Address,course,totalFees,feesPaid,remaiingFees,sports;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(String totalFees) {
		this.totalFees = totalFees;
	}

	public String getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}

	public String getRemaiingFees() {
		return remaiingFees;
	}

	public void setRemaiingFees(String remaiingFees) {
		this.remaiingFees = remaiingFees;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public Student(String name,String cl,String section,String gender,String mobileNo,
			String city,String state,String Address,String course,String totalFees,String feesPaid,String remaiingFees,
			String sports,int rollNo){
		this.name=name;
		this.cl = cl;
		this.section=section;
		this.gender=gender;
		this.mobileNo=mobileNo;
		this.city=city;
		this.state=state;
		this.Address=Address;
		this.course=course;
		this.totalFees=totalFees;
		this.feesPaid=feesPaid;
		this.remaiingFees=remaiingFees;
		this.sports=sports;
		this.rollNo = rollNo;
		
	}

	
}
