public class DependencyInversion {
}

interface MessageService{
    void sendMessage(String message);
}
class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms sent: " + message);
    }
}

class Notification {
    MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }

    public static void main(String[] args) {
        Notification notification = new Notification(new SmsService());
        notification.sendNotification("Walid");
        notification.setMessageService(new EmailService());
        notification.sendNotification("Mohammed");
    }



}

interface File{
    void save();
}

class pdf implements File{
    public void save(){
        System.out.println("pdf saved");
    }
}

class xsls implements File{
    public void save(){
        System.out.println("xsls saved");
    }
}

class docx implements File{
    public void save(){
        System.out.println("docx saved");
    }
}

class pdfA implements File{
    public void save(){
        System.out.println("pdfA saved");
    }
}

class SaveFile{
    File file;

    public SaveFile(File file){
       this.file = file;
    }

    public void saveFile(){
        file.save();
    }

    public static void main(String[] args) {
        SaveFile saveFile = new SaveFile(new docx());
        saveFile.saveFile();
    }

}
