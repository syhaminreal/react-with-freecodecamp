const express = require("express");
const app = express();
const cors = require("cors")
const bookRoute = require("./routes/booksRoutes.js");
require("./connection/conn.js");
app.use(cors())
app.use(express.json()); // Call express.json as a function
app.use("/api/v1", bookRoute);

app.listen(3000, () => {
    console.log("Server started successfully");
});
