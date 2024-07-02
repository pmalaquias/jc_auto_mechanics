# JC Auto Mechanic

This pilot project aims to create a management system for an auto mechanic workshop. The system should be able to manage clients, vehicles, services, and work orders. And most importantly, generate invoices for the clients.

## Table of Contents

- [JC Auto Mechanic](#jc-auto-mechanic)
  - [Table of Contents](#table-of-contents)
  - [Estrutura do Projeto](#estrutura-do-projeto)
    - [Camadas](#camadas)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Contributing](#contributing)
  - [License](#license)
  - [Contact](#contact)

## Estrutura do Projeto

A estrutura do projeto está organizada em camadas para promover a separação de responsabilidades e facilitar a manutenção e a escalabilidade do código.

````plaintext
├───api
├───data
│   ├───models
│   └───usecases
├───domain
│   ├───entities
│   ├───helpers
│   └───usecases
├───main
│   ├───builder
│   ├───composities
│   └───factories
├───presentation
│   ├───presenter
│   └───protocols
├───ui
│   ├───assets
│   ├───components
│   ├───helpers
│   ├───pages
│   ├───theme
│   └───utils
└───validation
    ├───protocols
    └───validators
````

### Camadas

1. **Domain**:
   - **Entities**: Classes que representam os objetos de negócios centrais do projeto, como Car, Service, Mechanic e Appointment.
   - **Helpers**: Classes de ajuda.
   - **UseCases**:  Classes que implementam a lógica de negócios, como GetAllCars, ScheduleAppointment, GetAvailableMechanics, e GetServices.
2. **Data**:
   - **Models**: Representações de dados que podem ser mapeadas para entidades de domínio.
   - **UseCases**: Casos de uso.
   - **Repositories**: Interfaces e implementações responsáveis por gerenciar operações de dados.
3. **Presentation**:
    - **Presenter**: Classes de apresentação.
    - **Protocols**: Protocolos de apresentação.
    - **ViewModel**: Classes que fornecem dados para a UI e lidam com a lógica de negócios da interface do usuário.
4. **UI**:
    - **Components**: Componentes de interface do usuário.
    - **Pages**: Páginas de interface do usuário.
    - **Theme**: Temas de interface do usuário.
5. **Validation**:
    - **Protocols**: Protocolos de validação.
    - **Validators**: Validadores.

## Installation

Para clonar e executar este projeto, você precisará do Git e do Android Studio instalados em seu computador.

```bash
# Clone o repositório
git clone https://github.com/pmalaquias/jc_auto_mechanics.git

# Abra o projeto no Android Studio

````

## Usage

Instructions on how to use the project and any relevant examples.

## Contributing

Guidelines on how to contribute to the project and any code of conduct.

## License

Information about the project's license and any additional terms or disclaimers.

## Contact
