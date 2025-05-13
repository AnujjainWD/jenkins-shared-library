package org.demo

// Utility class to send email notifications
class Utils implements Serializable {

    def script

    Utils(script) {
        this.script = script
    }

    // Send email on success
    def sendSuccessEmail() {
        script.echo "Sending success email..."
        script.mail(
            to: 'recipient@example.com', // Receiver's email
            subject: "Jenkins Pipeline Success",
            body: "Hello,\n\nYour Jenkins pipeline has successfully completed!\n\nRegards,\nDevOps Team"
        )
    }
}
