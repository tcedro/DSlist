# DSlist
### Software de Listagem de Jogos de Video Game
Este é um software desenvolvido em Java Spring Boot, que utiliza a estrutura de 3 camadas para listar jogos de video game. Ele foi homologado utilizando Docker e Postgre como banco de dados.

# Tecnologias Utilizadas
- Java Spring Boot
- Docker
- PostgreSQL
- Estrutura de 3 Camadas
# O software segue uma arquitetura de 3 camadas, com as seguintes responsabilidades:

Camada de Apresentação: Responsável pela interação com o usuário. Nesse caso, a camada de apresentação inclui a interface para listar os jogos de video game.
Camada de Negócios: Responsável pela lógica de negócios do software. Aqui estão as regras específicas para a listagem de jogos, como filtros, ordenação, etc.
Camada de Dados: Responsável pelo acesso e manipulação dos dados. O software utiliza o PostgreSQL como banco de dados para armazenar as informações dos jogos.
Homologação com Docker e Postgre
O software foi homologado utilizando o Docker para criar um ambiente isolado e reproduzível. Com o Docker, é possível empacotar todas as dependências e configurações necessárias para o software em um container. Além disso, o Postgre foi utilizado como banco de dados para persistir os dados dos jogos.

# Configuração
### Para executar o software, siga as etapas abaixo:

1. Instale o Docker em seu sistema.
2. Clone o repositório do software.
3. Acesse o diretório do projeto.
4. Execute o comando docker-compose up -d para iniciar os containers do Docker.
5. Aguarde até que todos os containers estejam em execução.
6. Acesse o software através do seu navegador utilizando o endereço http://localhost:8080.
7. Certifique-se de que as portas necessárias estejam liberadas e de que você tenha as 8. 8.8. permissões adequadas para executar o Docker.

# Contribuição
Contribuições são bem-vindas! Se você quiser melhorar este software, fique à vontade para abrir uma issue ou enviar um pull request para o repositório.

# Licença
Este software é distribuído sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.
