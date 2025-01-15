# 📚 FórumHub

API REST para gerenciamento de tópicos de fórum.

## 🚀 Funcionalidades

- 📝 Criar um novo tópico
- 📋 Mostrar todos os tópicos criados
- 🔍 Mostrar um tópico específico
- ✏️ Atualizar um tópico
- 🗑️ Eliminar um tópico

## 🛠️ Tecnologias Utilizadas

- ☕ Java
- 🌱 Spring Boot
- 🗄️ JPA/Hibernate
- 🛢️ H2 Database

## 📦 Estrutura do Projeto
forumhub/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── alura/ │ │ │ └── demo/ │ │ │ ├── ForumhubApplication.java│ │ │ ├── controller/ │ │ │ │ └── TopicController.java│ │ │ ├── model/ │ │ │ │ └── Topic.java│ │ │ ├── repository/ │ │ │ │ └── TopicRepository.java│ │ │ ├── service/ │ │ │ │ └── TopicService.java│ │ │ ├── exception/ │ │ │ │ └── ResourceNotFoundException.java│ │ │ ├── dto/ │ │ │ │ └── TopicDTO.java│ │ │ ├── mapper/ │ │ │ │ └── TopicMapper.java│ │ │ └── config/ │ │ │ └── SecurityConfig.java│ │ ├── resources/ │ │ │ ├── application.properties│ │ │ └── data.sql│ └── test/ │ └── java/ │ └── alura/ │ └── demo/ │ └── ForumhubApplicationTests.java├── .gitignore ├── mvnw ├── mvnw.cmd├── pom.xml└── README.md


## 🏃‍♂️ Como Executar

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd forumAlura

   Execute o Maven para compilar e rodar a aplicação:

* bash
./mvnw spring-boot:run
Acesse http://localhost:8080/api/topics para interagir com a API.

🔗 Links Úteis
## Documentação do Spring Boot

- Documentação do JPA/Hibernate

- Documentação do H2 Database

📄 Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.




