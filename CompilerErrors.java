class CompilerErrors {
  public static void main(String[] args){
    
    double workingVariableName$_32 = 5.6;
    int nonInitializedVariable;
    String ^&@*)*22748365 = "Illegal Variable Name";
    String 5 = "Bad naming convention or error?";
    int int = 69;//variable that uses keyword as name
  
    
    public static void localVariableScopeViolationFunction(){
      boolean localVar = true;
    }
    
    System.out.print(workingVariableName$_32);//this should not produce an error, prints 5.6
    
     System.out.print(localVar);//scope error
     System.out.print(nonInitializedVariable);//not initialized error
     System.out.print(int);//keyword variable, should produce an error
     System.out.print(^&@*)*22748365);//illegal characters in String variable name produce error
     System.out.print(5);//prints String variable or makes an error due to bad variable name?
  
  }
}
