public class BudgetCalculator {
  public static void main(String[] args) {
    
  // constants below
  final double SALARY = 3000.0;
  final double SAVINGS_PERCENT = 0.20;
  final double RENT_PERCENT = 0.30;
  final double GROCERIES_PERCENT = 0.15;
  final double ENTERTAINMENT_PERCENT = 0.10;

  // variables below
  double monthlySalary;
  double savedAmount;
  double rentAmount;
  double groceriesAmount;
  double entertainmentAmount;
  double totalExpenses;
  double remainingBalance;
    
  // initially setting to SALARY
  monthlySalary = SALARY;

  // calculations below
  savedAmount = monthlySalary * SAVINGS_PERCENT;
  rentAmount = monthlySalary * RENT_PERCENT;
  groceriesAmount = monthlySalary * GROCERIES_PERCENT;
  totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
  remainingBudget = monthlySalary - totalExpenses;

  // displaying results
  System.out.println("Monthly salary: " + monthlySalary);
  System.out.println("Amount saved: " + savedAmount);
  System.out.println("Amount spent on rentm " + rentAmount);
  System.out.println("Amount spent on groceries: " + groceriesAmount);
  System.out.println("Amount spent on entertainment: " + entertainmentAmount);
  System.out.println("Total expenses: " + totalExpenses);
  System.out.println("Remaining balance: " + remainingBalance);
