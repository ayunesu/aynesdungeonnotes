import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
        let saveFile = () => {
            // Get the data from each element on the form.
            const date = document.getElementById("date");
            const places = document.getElementById("places");
            const npcs = document.getElementById("npcs");
            const events = document.getElementById("events");
            const todo = document.getElementById("todo");

            // This variable stores all the data.
            let data = "\r Dátum: " + date.value + " \r\n " + "Ahol jártunk: " + places.value + " \r\n " + "Akikkel találkoztunk: " + npcs.value + " \r\n " + "Ezek történtek: " + events.value + " \r\n " + "Teendők legközelebbre: " + todo.value;
            console.log(data); //printing form data into the console
            // Convert the text to BLOB.
            const textToBLOB = new Blob([data], { type: "text/plain" });
            var filename = new Date();
            var month =new Date(); //months from 1-12
            month = month.getMonth();

            var day = new Date();
            var day = day.getUTCDate();

            var year = new Date();
            var year = year.getUTCFullYear();

            newdate = year + "/" + month + "/" + day;
            const sFileName = filename; // The file to save the data.

            let newLink = document.createElement("a");
            newLink.download = new Date();

            if (window.webkitURL != null) {
                newLink.href = window.webkitURL.createObjectURL(textToBLOB);
            } else {
                newLink.href = window.URL.createObjectURL(textToBLOB);
                newLink.style.display = "none";
                document.body.appendChild(newLink);
            }

            newLink.click();
        };
	}