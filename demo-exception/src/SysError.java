public enum SysError {
  INVALID_USERNAME("Username is invalid"),
  INVALID_PASSWORD("Password is invalid"),;

  private String errorMessage;

  private SysError(String errorMessage){
    this.errorMessage = errorMessage;
  }
  public String getDesc(){
    return this.errorMessage;
  }
}
