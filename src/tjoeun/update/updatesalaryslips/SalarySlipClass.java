package tjoeun.update.updatesalaryslips;

public class SalarySlipClass {
    
    private int id;
    private String name;
    private String post;
    private String monthName;
    private int totalWorkingDays;
    private double advance;
    private double deduction;
    private String dt;
    private double netSalary;

    /* Constructor */
    public SalarySlipClass(int id, String name, String post, String monthName, int totalWorkingDays, double advance, double deduction, double netSalary ,String dt) {
        setId(id);
        setName(name);
        setPost(post);
        setMonthName(monthName);
        setTotalWorkingDays(totalWorkingDays);
        setAdvance(advance);
        setDeduction(deduction);
        setNetSalary(netSalary);
        setDt(dt);
     }

      public boolean setId(int id) {
       if (id > 0)
         this.id = id;
       else {
         this.id = id *-1;
        throw new IllegalArgumentException("Employee ID must be in positive Integers.");
       }
       return true;
    }
      
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean setNetSalary(double netSalary) {
        if (netSalary > 0)
        this.netSalary = netSalary;
        else{
            this.netSalary = netSalary*-1;
            throw new IllegalArgumentException("Net Salary must be in positive integers.");
        }
        return true;
    }
        public void setPost(String post) {
        if (!post.equals("Choose"))
        this.post = post;
        else
            this.post = "Wrong Selection.";
    }

    public void setMonthName(String monthName) {
        if (!monthName.equals("Choose"))
        this.monthName = monthName;
        else
            this.monthName = "Wrong Selection.";
    }

    public boolean setTotalWorkingDays(int totalWorkingDays) {
        if (totalWorkingDays > 0)
        this.totalWorkingDays = totalWorkingDays;
        else {
            this.totalWorkingDays = totalWorkingDays*-1;
            throw new IllegalArgumentException("Working Days must be in positive integers.");
          }
         return true;
    }

    public boolean setAdvance(double advance) {
    	if (advance == 0) {
    		this.advance = 0;
    	} else {
    	
	       if (advance > 0)
	        	this.advance = advance;
	       else{
	            this.advance = advance *-1;
	            throw new IllegalArgumentException("Advance must be in positive integers.");
	            
	       }
       }
        return true;
    }

    public boolean setDeduction(double deduction) {
    	
    	if (deduction == 0) {
    		this.deduction = 0;
    	} else {
	        if (deduction > 0)
	        this.deduction = deduction;
	        else {
	            this.deduction = deduction *-1;
	            throw new IllegalArgumentException("Deduction must be in positive integers.");
	        }
    	}
        return true;
    }

    public void setDt(String dt) {
        if (!dt.equals("Choose"))
            this.dt = dt;
        else 
            this.dt = "Wrong Selection";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public double getGross() {
        return getNetSalary() - (getAdvance() + getDeduction());
    }

    public double getAdvance() {
        return advance;
    }

    public double getDeduction() {
        return deduction;
    }

    public String getDt() {
        return dt;
    }

    public double getNetSalary() {
        return netSalary;
    }

    
    
    
    
    
    
}
