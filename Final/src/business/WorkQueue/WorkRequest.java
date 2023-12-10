
package business.WorkQueue;

import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * 
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
        private UserAccount sender2;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String type;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public UserAccount getSender2() {
        return sender2;
    }

    public void setSender2(UserAccount sender2) {
        this.sender2 = sender2;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    @Override
    
    public String toString(){
        return this.message;
    }
            
}
