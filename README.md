# chat-gpt-telegram-bot

The purpose of the ChatGPT Telegram Bot is to connect Telegram users with ChatGPT through OpenAI API

OpenAI API v1, application property 

openai.api.url=https://api.openai.com/v1/chat/completions

Model v3.5, application property 

openai.model=gpt-3.5-turbo

Code for calling OpenAI API is based on the following Baeldung article: https://www.baeldung.com/spring-boot-chatgpt-api-openai

Telegram API Java library is https://github.com/pengrad/java-telegram-bot-api 

To start application please use jar file from this repository. Last version is 0.5 Command line for starting jar
file:

java -jar -D"openai.api.key={OpenAPIKey}" -D"telegram.bot.token={TelegramBotToken}"  
-D"spring.datasource.username={database user name}"  
-D"spring.datasource.password={database user password}"  
-D"spring.datasource.url=jdbc:postgresql://{database server IP address}/{database name}"  
chat-gpt-telegram-bot-0.5.jar

You can also define environment variables in your operating system:

openai.api.key={OpenAPIKey}
telegram.bot.token={TelegramBotToken}
spring.datasource.username={database user name}
spring.datasource.password={database user password}
spring.datasource.url=jdbc:postgresql://{database server IP address}/{database name}

Command line to start application in this case will be

java -jar chat-gpt-telegram-bot-0.5.jar

# Development team

* [Vasily Demin](https://github.com/CatOgre70)