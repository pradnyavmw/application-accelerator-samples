const express = require('express');
const app = express();
const port = process.env.PORT || 3000;
const greeting = process.env.GREETING || "WORLD";

app.get('/', (req, res) => {
  res.send('Hello from server to....' + greeting);
});

app.get('/health', (req, res) => {
  res.sendStatus(200);
});

app.listen(port, () => {
  console.log(`app listening at http://localhost:${port}`);
});



// const greeting = process.env.GREETING || "WORLD";
// var http = require("http");

// http.createServer(function (request, response) {
//     // Send the HTTP header 
//     // HTTP Status: 200 : OK
//     // Content Type: text/plain
//     response.writeHead(200, { 'Content-Type': 'text/plain' });

//     // Send the response body as "Hello World"
//     response.end('Hellooooo...' + greeting);
// }).listen(8081);

// // Console will print the message
// console.log('Server running at http://127.0.0.1:8081/');