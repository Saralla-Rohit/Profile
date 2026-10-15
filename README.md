# Spring Profiles – Radio Tuner

A Spring Framework project demonstrating **Spring Profiles, Java-based configuration, dependency injection, and externalized properties** using a radio tuner example.

## Architecture

```text
                    Main.java
                        |
               Spring ApplicationContext
                        |
             Profile Configuration
                /             \
             dev               qa
              |                 |
          Radio Bean         Radio Bean
              |                 |
           ITuner              ITuner
              |                 |
        DigitalTuner       AnalogTuner
              |                 |
     application-dev     application-qa
        .properties         .properties
```

## Project Structure

```text
src/main/java/
├── com/rohi/main/
│   └── Main.java
├── com/rohit/beans/
│   ├── Radio.java
│   ├── ITuner.java
│   ├── DigitalTuner.java
│   └── AnalogTuner.java
└── com/rohit/config/
    ├── ProfileDevConfig.java
    └── ProfileQaConfig.java

src/main/resources/
└── com/rohit/
    ├── application-dev.properties
    └── application-qa.properties
```

## Concepts Used

- **`@Component`** – Registers Spring-managed beans.
- **`@Autowired`** – Injects the tuner dependency into `Radio`.
- **`@Profile`** – Activates the appropriate tuner and configuration for a profile.
- **`@Configuration`** – Defines Java-based Spring configuration.
- **`@ComponentScan`** – Discovers components in the specified package.
- **`@PropertySource`** – Loads profile-specific properties.
- **`@Value`** – Injects property values into fields.
- **`AnnotationConfigApplicationContext`** – Creates and manages the Spring application context.

## Profile Configuration

| Profile | Tuner | Band | Range |
|---|---|---|---|
| `dev` | `DigitalTuner` | FM | 100–200 |
| `qa` | `AnalogTuner` | AM | 50–100 |

**`Radio.java`** receives the selected `ITuner` implementation through dependency injection and delegates tuning to it.

## Execution Flow

1. `Main.java` activates the desired profile.
2. Spring loads the matching configuration and properties.
3. Component scanning discovers the beans.
4. Spring injects the selected tuner into `Radio`.
5. `Radio.on(150)` tunes the radio and prints the output.

## Learning Objective

Understand how Spring Profiles switch implementations and configuration values without changing the main application logic.
