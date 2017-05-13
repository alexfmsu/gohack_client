<!-- <html>
    <head>
    <title></title>
    </head>
    <body>
        <form action="/login/" method="post">
            Username:<input type="text" name="username">
            Password:<input type="password" name="password">
            <input type="submit" value="Login">
        </form>
    </body>
</html> -->

 <html>
    <head>
        <title></title>

        <style>
            #container{
                width:80%;

                text-align: center;            
            
                margin-left: 10%;
            
                /*border:1px solid black;*/
            }

            #deal_form{
                display:inline-block;
                width:25%;

                text-align: center;
                
                /*border:1px solid black;*/
            }

            #deal_form input{
                width:100%;
            
                padding-left: 3px;
            }

            #deal_form select{
                width:100%;
            }

            .btn{    
                width:49% !important;
                
                border-radius: 3px;
                border:1px solid black;
            }

            nav{
                padding-bottom:40px;
            }
            nav a{
                padding:0 10 0 10px;
            }
        </style>

    </head>
    
    <body>
        <div id="container">
            <nav>
                <a href="/my_positions">История сделки</a>
                <a href="/new_deal">Новая сделка</a>
                <a href="/history">История сделки</a>
            </nav>

            <p>

            <form action="/login" method="GET" id="deal_form">
                <input type="text" name="count" placeholder="количество">
                <p>
                <input type="password" name="password" placeholder="цена">
                <p>
                <select>
                    <option>
                        Инструмент
                    </option>
                </select>
                <p>
                <input type="submit" value="Купить" class="btn">
                <input type="submit" value="Продать" class="btn">
            </form>
        </div>
    </body>
</html> 
