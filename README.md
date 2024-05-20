<!-- TÍTULO Y DESCRIPCIÓN -->
  <a name="ir-arriba"></a>
  # :rocket: Trabajo Final
  Trabajo Final para el Bootcamp de Java, iniciativa que la **Agencia de Aprendizaje a lo largo de la vida** organiza junto a **IT Patagonia** y la academia educativa **Codeki**.

  <div align="left">
    <table>
      <tr>
        <td>
        Consigna: Dos API REST CRUD a elección. Una API debe consultar a la otra API utilizando Eureka Server.
        </td>
      </tr>
    </table>
  </div>

<!-- ÍNDICE -->
  <a name="indice"></a>
  ## 📌 Índice
  <ol>
    <li><a href="#ir-arriba">Título y descripción del proyecto</a></li>
    <li><a href="#indice">Índice</a></li>
    <li><a href="#tecnologias">Tecnologías utilizadas</a></li>
    <li><a href="#instalacion">Instalación</a></li>
    <li><a href="#funcionalidadbook">Funcionalidad de api-book</a></li>
    <li><a href="#funcionalidadlibrary">Funcionalidad de api-library</a></li>
    <li><a href="#desarrollado">Desarrollado por...</a>
    <li><a href="#contacto">Contacto</a>
    <li><a href="#agradecimiento">Agradecimiento</a>
  </ol>

<!-- TECNOLOGÍAS UTILIZADAS -->
  <a name="tecnologias"></a>
  ## ✅ Tecnologías utilizadas
  <p align="center">
    <a href="https://www.java.com/" target="_blank"><img src="https://img.shields.io/badge/Java-blue?style=flat&logo=Java&logoColor=blue&labelColor=blue&color=blue"></a>
    <a href="https://spring.io/" target="_blank"><img src="https://img.shields.io/badge/Spring%20Boot-green?style=flat&labelColor=green&color=green"></a>
    <a href="https://maven.apache.org/" target="_blank"><img src="https://img.shields.io/badge/Maven-red?style=flat&labelColor=red&color=red"></a>
    <a href="https://mysql.com/" target="_blank"><img src="https://img.shields.io/badge/MySQL-blue?style=flat&labelColor=blue&color=blue"></a>
    <a href="https://github.com/" target="_blank"><img src="https://img.shields.io/badge/Github-grey?style=flat&labelColor=grey&color=grey"></a>
    
   </p>
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>

<!-- INSTALACIÓN -->
  <a name="instalacion"></a>
  ## 🔧 Instalación
  Si deseas correr la aplicación en un entorno local debes tener en cuenta lo siguiente: 
  1. Clona el repositorio utilizando GIT o descargando el archivo ZIP:

      `git clone https://github.com/JoanaColl/Codeki-Trabajo-Final.git`
  
  2. Modificá los datos de username y password en el `application-properties` para poder conectarte a MySQL.

  3. Importa el `SCRIPT SQL` que encontras en la carpeta raíz del proyecto.

  4. Crea las bases de datos `api-book` y `api-library`.

  5. En cada carpeta tendrás una aplicación distinta. Ejecutá primero `eureka-server`.

  6. Mientras `eureka-server` está funcionando podes abrir las otras dos apps y ejecutarlas `api-book` y `api-library`.

  7. Al ejecutar Eureka se te otorga una URL donde podrás verificar si las apps estan online.

  8. Para probar los endpoint es recomendable utilizar Postman. El puerto de cada app lo sabrás al ejecutarlas.
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>
  
<!-- FUNCIONALIDAD DE api-book -->
  <a name="funcionalidadbook"></a>
  ## ⚙️ Funcionalidad de api-book
  La aplicación `api-book` es un CRUD de libros y autores. Cuenta con los siguientes endpoints:

  <h3>• Author •</h3>
  
  createAuthor: `localhost:PORT/api/author`<br>
  ```json
  {
    "firstname":"George",
    "lastname":"Orwell"
  }
  ```
  getAllAuthors: `localhost:PORT/api/author`<br>
  authorById: `localhost:PORT/api/author/ID_AUTHOR`<br>
  updateAuthor: `localhost:PORT/api/author/update`<br>
  ```json
  {
    "id": 1,
    "firstname":"Stephen",
    "lastname":"King"
  }
  ```
  deleteAuthor: `localhost:PORT/api/author/ID_AUTHOR`<br>
  
  <h3>• Book •</h3>
  
  createBook: `localhost:PORT/api/book?id=ID_AUTHOR`<br>
  ```json
  {
    "title": "Carrie"
  }
  ```
  getAllBooks: `localhost:PORT/api/book`<br>
  bookById: `localhost:PORT/api/book/ID_BOOK`<br>
  updateBook: `localhost:PORT/api/book/update`<br>
  ```json
  {
    "id": 1,
    "title": "Carrie",
    "author": {
                "id": 1,
                "firstname": "Stephen",
                "lastname": "King"
              }
  }
  ```
  deleteBook: `localhost:PORT/api/book/ID_BOOK`<br>
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>

<!-- FUNCIONALIDAD DE api-library -->
  <a name="funcionalidadlibrary"></a>
  ## ⚙️ Funcionalidad de api-library
  La aplicación `api-library` es un CRUD de una libreria personal. Cuenta con los siguientes endpoints:

  <h3>• Library •</h3>
  
  createLibrary: `localhost:PORT/api/library`<br>
  ```json
  {
    "name":"Nana Library",
    "idBook":1
  }
  ```
  getAllLibrary: `localhost:PORT/api/library`<br>
  libraryById: `localhost:PORT/api/library/ID_LIBRARY`<br>
  allLibraryBooks: `localhost:PORT/api/library/librarybook/all`<br>
  getLibraryBook: `localhost:PORT/api/library/librarybook?id=ID_LIBRARY`<br>
  updateLibrary: `localhost:PORT/api/library/update`<br>
  ```json
  {
    "id": 1,
    "name":"Nana Library",
    "idBook":2
  }
  ```
  deleteLibrary: `localhost:PORT/api/library/ID_LIBRARY`<br>
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>

<!-- DESARROLLADO POR -->
  <a name="desarrollado"></a>
  ## 💁 Desarrollado por...
  * **Joana Coll** - [joanacoll](https://github.com/joanacoll)
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>
  
<!-- CONTACTO -->
  <a name="contacto"></a>
  ## 📩 Contacto
  Si deseas contactarte conmigo:
  <a href="mailto:colljoana@gmail.com" target="_blank">
<img src="https://img.shields.io/badge/colljoana-red?style=flat&logo=Gmail&logoColor=white&labelColor=red" alt="Gmail"></a>
<a href="https://ar.linkedin.com/in/joanacoll" target="_blank"><img src="https://img.shields.io/badge/joanacoll-blue?style=flat&logo=Linkedin&logoColor=white&labelColor=blue" alt="Linkedin"></a>
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>

<!-- AGRADECIMIENTO -->
  <a name="agradecimiento"></a>
  ## ❤️ Agradecimiento
  Gracias por leer hasta aquí, espero que el proyecto te sea útil. Obviamente puede mejorarse y lo haré en un futuro, pero es un ejemplo simple de como consumir una api desde otra api.
  No tiene Licencia pero podes usarlo como gustes mientras sigas fomentando el código libre y ayudando a otros pares. 
  
  ¡Que tengas un lindo día!
  
  Nana ✨
  <p align="right"><a href="#ir-arriba">:arrow_up:</a></p>
