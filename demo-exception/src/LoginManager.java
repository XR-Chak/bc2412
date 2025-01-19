public class LoginManager {
  private String username;
  private String password;

  public LoginManager(String username,String password){
    this.username = username;
    this.password = password;
  }

  public static class BusinessRunTimeException extends RuntimeException{
    //Runtime -> spelling mistake
    //"Invalid User Name.""
    //"Invalid User password"
    public static BusinessRunTimeException of(SysError sysErr){
      return new BusinessRunTimeException(sysErr);
    }

    public BusinessRunTimeException(SysError sysErr){// Best design!!!!
      super(sysErr.getDesc());
    }

  }

  public static class InvalidUsernameException extends RuntimeException{
    public InvalidUsernameException(String message){
      super(message);
    }
  }

  public static class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String message){
      super(message);
    }
  }


  public void validateUsername() {
    if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUsernameException("Username is invalid: "+ this.username);
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  public void validatePassword() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw BusinessRunTimeException.of(SysError.INVALID_PASSWORD);
    }
  }

  public void validateUsername2() {
    if (this.username == null || this.username.isEmpty()) {
      throw BusinessRunTimeException.of(SysError.INVALID_USERNAME);
    }
  }


  public void validatePassword2() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw BusinessRunTimeException.of(SysError.INVALID_PASSWORD);
    }
  }


  public static void main(String[] args) {
    LoginManager lm1 = new LoginManager("asd", "abcd123!");
    //1. We can define the program flow by custom exception
    //Approach 1
    try{
      lm1.validateUsername();
      lm1.validatePassword();
    }catch(InvalidUsernameException e){
      System.out.println(e.getMessage());
    }catch(InvalidPasswordException e){
      System.out.println(e.getMessage());
    }

    LoginManager lm2 = new LoginManager("asd", "abcd1234");
    //Approach 2
    try{
      lm2.validateUsername2();
      lm2.validatePassword2();
      System.out.println("Validate success");
    }catch(InvalidUsernameException e){
      System.out.println(e.getMessage());
    }catch(InvalidPasswordException e){
      System.out.println(e.getMessage());
    }
    
  }
}
