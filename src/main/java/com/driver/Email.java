package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }
    public Email(String emailId,String password)
    {
        this.emailId=emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword!=this.password) return;
        if(newPasdword.length()<8) return;
       // boolean cha=false;
        boolean uppercase=false;
        boolean lowercase=false;
        boolean digit=false;
        boolean schar=false;
        for(int i=0;i<newPassword.length();i++)
        {
            if(newPassword.charAt(i)>=33 && newPassword.charAt(i)<=47 || newPassword.charAt(i)>=58 && newPassword.charAt(i)<=64 || 
              newPassword.charAt(i)>=91 && newPassword.charAt(i)<=96 || newPassword.charAt(i)>=123 && newPassword.charAt(i)<=126)
            {
                schar=true;
            }
            if(newPassword.charAt(i)>=65 && newPassword.charAt(i)<=90) uppercase=true;
            if(newPassword.charAt(i)>=97 && newPassword.charAt(i)<=122) lowercase=true;
            if(newPassword.charAt(i)>=48 && newPassword.charAt(i)<=57) digit=true;
        }
        if(schar && uppercase && lowercase && digit) 
        {
            this.password=newPassword;
        }
            
        
    }
}
