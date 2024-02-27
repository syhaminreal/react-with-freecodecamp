const mongoose = require("mongoose")
mongoose.connect("mongodb+srv://shyam9876yadav:in09BKs6kQjURAio@bookstore.7xgbzey.mongodb.net/?retryWrites=true&w=majority&appName=bookstore").then(() => {
  console.log("Connected");
}).catch(err => {
  console.error("Connection error:", err);
});
