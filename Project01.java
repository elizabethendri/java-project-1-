/* Elizabeth Endri 
CSC 229 -- Project 01 
9/6/2018

This program will read information about the employee using consecutive 
input dialogs.
*/

import javax.swing.JOptionPane;


public class Project01 
{
	public static void main(String[] args) 
	{
		
		String firstName = JOptionPane.showInputDialog("Please enter employee first name: ");
		String lastName = JOptionPane.showInputDialog("Please enter employee last name: ");
		
		String input;
		input = JOptionPane.showInputDialog(null, "Please enter your number of hours worked: ");
		int hoursWorked = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Please enter your hourly rate: ");
		double hourlyRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Please enter your state tax rate: ");
		double stateRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Please enter your federal tax rate: ");
		double federalRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Please enter your retirement plan reduction rate: ");
		double retireRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Please enter your health insurance premuim:  ");
		double healthInsurance = Double.parseDouble(input);
		
		
		//Calculations for gross pay, state tax, federal tax, retirement rate
		double grossPay = hoursWorked * hourlyRate;
		double stateTax = stateRate * grossPay;
		double federalTax = federalRate *grossPay;
		double retirementRate1 = retireRate * grossPay;
		
		
		// Final Net Pay Calculation
		double netPay = grossPay - stateTax - federalTax - retirementRate1 - healthInsurance;
		
		JOptionPane.showMessageDialog(null, "Project01 CSC 229" +"\n"+
			    "________________________" +"\n"+
                "First Name :  "+firstName +"\n"+
                "Last Name : "+lastName +"\n"+
                "________________________" +"\n"+
                "Number of Hours Worked : "+hoursWorked +"\n"+
                "Hourly rate:  " +hourlyRate + "\n"+
                
                "Gross Pay:  "+grossPay+"\n"+				                            
                "State income tax rate: " +stateTax+"\n"+
                
                "Federal Income Tax Rate:  " +federalTax+"\n"+
                "Retirement Plan: " +retirementRate1+ "\n"+
                
                "Health Insurance Premium:   " +healthInsurance+ "\n"+
                "_______________________" +"\n"+
                "Net Pay:   " +netPay+ "\n"
                
		);
		
	}
}
		
		/*  OLD Program
		String input;
		System.out.println("Hello World");
		//The following will return a string
		String firstName = JOptionPane.showInputDialog("Please enter employee first name: ");
		String lastName = JOptionPane.showInputDialog("Please enter employee last name: ");
		
		input = JOptionPane.showInputDialog("Please enter number of hours worked(whole number): ");
		int numberOfHoursWorked = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Please enter your hourly rate (fractional number): ");
		double hourlyRate = Double.parseDouble(input);		
		
		
		
		
		//calculate gross pay = hoursWorked*hourlyRate
		
		double grossPay = numberOfHoursWorked * hourlyRate;
		
		
		//state income tax 
		input = JOptionPane.showInputDialog("Please enter your state income tax rate(fractional number): ");
		double stateIncomeTaxRate = Double.parseDouble(input);
		
		double stateIncomeTax = grossPay * stateIncomeTaxRate;
		
		
		
		//federal tax income
	
		input = JOptionPane.showInputDialog("Please enter your federal income tax (fractional number): ");
		double federalIncomeTax = Integer.parseInt(input);
		
		double fedIncomeTax = grossPay * federalIncomeTax;
		
		
		//Retirement plan deduction
		input = JOptionPane.showInputDialog("Please enter how much you want to put aside for retirement (fractional number): ");
		double retirementPlan = Integer.parseInt(input);
		
		double retirePlan = grossPay - retirementPlan;
		
		
		//Health insurance deduction
		input = JOptionPane.showInputDialog("Please enter your health insurance deduction (fractional number): ");
		double healthInsurance = Integer.parseInt(input);
		double healthInsure = grossPay - healthInsurance;
		
		//Calculate Net Pay 
		
		double netPay = grossPay - (stateIncomeTax + fedIncomeTax + retirePlan + healthInsure);
		
		
		// Display Program Box 
		
		JOptionPane.showMessageDialog(null, "Project01 CSC 229" +"\n"+
										    "________________________+" +"\n"+
				                            "First Name :  "+firstName +"\n"+
				                            "Last Name : "+lastName +"\n"+
				                            "________________________+" +"\n"+
				                            "Number of Hours Worked : "+numberOfHoursWorked +"\n"+
				                            "Hourly rate:  " +hourlyRate + "\n"+
				                            
				                            "Gross Pay:  "+grossPay +"\n"+				                            
				                            "State income tax rate: " +stateIncomeTax+"\n"+
				                            
				                            "Federal Income Tax Rate:  " +fedIncomeTax+"\n"+
				                            "Retirement Plan: " +retirePlan+ "\n"+
				                            
				                            "Health Insurance Premium:   " +healthInsure+ "\n"+
				                            "_______________________+" +"\n"+
				                            "Net Pay:   " +netPay+ "\n"
				                            
									);
*/
