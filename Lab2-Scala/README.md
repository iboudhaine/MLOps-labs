# Scala: Foundational Exercises

This lab serves as a disciplined introduction to the core principles of the Scala language.

## Environment Configuration

Precision in the environment is mandatory. The required versions are archaic, and modern installers present unnecessary complexity.

**Required Versions:**

- **Java:** `8`
- **Scala:** `2.11.0`
- **SBT:** `1.3.3`

### Recommended Path: SDKMAN

The most direct path is through SDKMAN. It isolates these outdated dependencies, avoiding the configuration pain of package managers like Coursier for this specific setup.

Install SDKMAN and execute these commands precisely:

```bash
sdk install java 8.0.472-amzn
sdk install scala 2.11.0
sdk install sbt 1.3.3
```

For other methods, one may consult the [official documentation](https://www.scala-lang.org/download/), but this is not advised.

## Structure of the Lab

The repository is organized with logical clarity.

- `lab_scala.pdf`: The original assignment, presented in French.

- `lab_scala.ipynb`: **The definitive guide.** This notebook is a meticulous, step-by-step chronicle of the solutions in English. The evolution of the code and the logic behind each transformation are detailed within.

- **Source Code & Data:** The remaining `.scala` files and data (`part-00000`) represent the final, perfected state for each exercise. To understand the journey (the intermediate steps and refinements) one must consult the notebook. The destination is meaningless without understanding the path.
