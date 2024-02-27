const router= require("express").Router()
const bookModel = require("../models/booksModel")

//post request
router.post("/add", async (req, res) => {
try{
 const data = req.body
 const newBook = new bookModel(data)
 await newBook.save().then(() => {
    res.status(200).json({ message: "Book Added Sucessfully"})
 })
}catch(error){
    console.log(error)
}
})

//router.get()
router.get("/getBooks", async (req, res) => {
    let books
    try {
         books = await bookModel.find();
        res.status(200).json({books});
    } catch (error) {
        console.log(error);
        res.status(500).json({ message: "Internal Server Error" });
    }
});
//get with id
router.get("/getBooks/:id", async (req, res) => {
    let book;
    const id = req.params.id;
    try {
        book = await bookModel.findById(id);
        if (!book) {
            return res.status(404).json({ message: "Book not found" });
        }
        res.status(200).json({ book });
    } catch (error) {
        console.log(error);
        res.status(500).json({ message: "Internal Server Error" });
    }
});

//update with id
router.put("/updateBooks/:id", async (req, res) => {
    const id = req.params.id;
    const { bookname, description, author, image, price } = req.body;

    try {
        let book = await bookModel.findById(id); // Find the book by ID

        if (!book) {
            return res.status(404).json({ message: "Book not found" });
        }

        // Update the properties of the found book
        book.bookname = bookname;
        book.description = description;
        book.author = author;
        book.image = image;
        book.price = price;

        // Save the updated book
        await book.save();

        // Send the updated book as response
        res.json(book);
    } catch (error) {
        console.log(error);
        res.status(500).json({ message: "Internal Server Error" });
    }
});

//delete by id
router.delete("/deleteBook/:id", async (req, res) => {
    const id = req.params.id;
    try{
  await bookModel
  .findByIdAndDelete(id).then(()=>res.status(201).json({"message":"deleted Sucesfully"}))
    }catch(error){
        console.log(error)
    }
})

module.exports = router