# Reservance
  Este projeto foi desenvolvido para a prática do conteúdo de programação orientada a objetos. Basicamente, o Reservance se trata de um sistemas de reservas totalmente repensado e tem como objetivo introduzir um novo conceito relacionado a esse escossitema. Com funcionalidades mais interativas e e com o intuito de automatizar esse processo, tornando-o mais amigável tanto para a empresa que o utiliza quanto para o consumidor.

## Tecnologias Utilizadas

* Spring Boot 
* React

## Estrutura do Projeto
### Backend (Spring Boot)
* 'src/main/java': Contém os arquivos Java da aplicação.
* 'src/main/resources': Contém os arquivos de recursos, como configuração e arquivos estáticos.

### Frontend (React)
* 'src': Contém os arquivos JavaScript e CSS do aplicativo.
* 'public': Contém os arquivos estáticos, como HTML e imagens utilizadas.

## Configuração do Ambiente 

### Backend (Spring Boot)
1. Tenha certeza de que o Java Development Kit (JDK) e o Maven estejam instalados em sua máquina.
2. Importe este repositório para sua IDE, de preferência alguma voltada para o desenvolvimento em Java, como o Eclipse, por exemplo.
3. Configure o banco de dados no arquivo 'application.properties'
4. Abra um terminal no diretório raiz do projeto e execute o comando: `mvn spring-boot:run`

### Frontend (React)
1. Tenha certeza de que tanto o Node.js quanto o NPM estejam instalados em sua máquina.
2. Clone o repositório e navegue até o diretório raiz do mesmo pelo terminal.
3. Execute o comando `npm install` para instalar as dependências do projeto.
4. Execute o comando `npm start` para iniciar o servidor de desenvolvimento.

## Execução

### Spring Boot
##### Ao iniciar o Spring Boot, será possível acessar o servidor do backend a partir do link <https://localhost:8080>
##### Os endpoints serão documentados mais a frente no repositório.

### React 
##### Ao iniciar o React, será possivel acessar o servidor de desenvolvimento a partir do link <https://localhost:3000>

## Funcionalidades do Projeto
A principal funcionalidade deste aplicativo é realizar a criação de um espaço em um restaurante, possibilitando a escolha do número de mesas desejadas no espaço e, por meio de uma interface interativa, e a organização do espaço de seu restaurante. Com isso, os clientes poderão ter acesso ao seu "mapa" criado e, assim, escolher a mesa de forma mais dinâmica e automatizada. A requisição do usuário é enviada automaticamente ao banco de dados e as informações sobre a reserva são criadas no mesmo instante, fazendo o processo muito mais rápido e independente.

## Licença 
Este projeto está licenciado sob a [Apache-2.0 license]. Consulte o arquivo LICENSE.md para mais informações.

## Contato
Para mais informações ou dúvidas, por favor entrar em contato pelo e-mail: tidallecio@gmail.com
