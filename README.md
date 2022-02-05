# Sort Manager

## Table of Contents:

* [General Info](#general-info)
* [Test Coverage](#test-coverage)
* [Use](#use)
* [Technologies](#techonologies)
* [Setup](#setup)

## General Info:
This project will use the 'Bubble and Merge' sort logic to sort an array of 40 random integers. This array may contain duplicates.
1. Phase One:
   * Write a program that will take an array of `ints` and sort it using a **bubble** sort algorithm and then a **merge** sort algorithm.
   * Include **JUnit** tests for this and all subsequent phases. Code passing tests in phase 1? &#9745;
2. Phase Two:
   * Project updated following the MVC design pattern. Code passing tests in phase 2? &#9745;
3. Phase Three:
   * Project updated to track and log classes and methods.
4. Phase Four:
   * Integrates a Binary Search Tree class that sorts elements from an unsorted list into the tree. Then, it retrieves an array of that Binary Tree sorted. Code passing tests in phase 4? &#9745;
6. Phase Five:
   * Timing information added. This allows to compare algorithms performance.

## Use:
1. The user will be asked to choose the sorting method desired.
   ![firstStep](https://user-images.githubusercontent.com/63067669/152597459-7dd046e4-7a7d-4177-b871-862eca2ad3dc.png)

2. Then, the user will have to choose the length of the array.
   ![secondStep](https://user-images.githubusercontent.com/63067669/152597473-9b51ad52-f45e-4642-87c8-b736d4e6ed42.png)

3. Finally, the array will be populated with random numbers and the algorithms will sort it.
   ![result](https://user-images.githubusercontent.com/63067669/152597480-a2dde099-cc3b-4c8d-ad74-cf6a464270af.png)

## Test Coverage:

This test coverage includes the running of the three sorting methods (Bubble, Merge and BST):
![CoverageReport](https://user-images.githubusercontent.com/63067669/152597668-bec3de53-f6c4-4ce3-855d-e53c14e7dc17.png)

Three unit tests have been used to test this project. The same three cases have been applied for the three methods which includes:
   * Sort an array of unsorted integers.
   * Zero elements in the array which returns an empty array.
   * Same value for all integers in the array. For the Bubble and Merge sorting method, return the same array. For the BST, it returns a one element array.


| Test Type          | Test Results |
|--------------------|:------------:|
| Bubble             |        ![BubbleSortTester](https://user-images.githubusercontent.com/63067669/152651952-9f591083-d611-4410-b1fb-4a5b9dc1179a.png)      |
| Merge              |   ![MergeSortTester](https://user-images.githubusercontent.com/63067669/152651950-e104fa41-6f5d-4aeb-a749-fdcf2a152480.png)    |
| Binary Tree Search |     ![BSTTester](https://user-images.githubusercontent.com/63067669/152651951-74f1e59d-d3dd-42bf-9b75-8f20501a5475.png)  |

   * For the view class. A manual test has been performed:
     * This includes other inputs than "b", "m" and "t" for the _getDesiredType()_ function.
     * This includes negative numbers and large numbers for the _getArrayLength()_ function.
     * This includes the right _output printed_ on the terminal.

## Technologies:

Project created with:
* IntelliJ IDEA 2021.3.1
* junit-jupiter:5.8.2
* apache.logging.log4j:2.17.1
* Java for IntelliJ
* GitHub Desktop
* GitHub

## Programs/Libraries/Frameworks:
* [Intellij](https://www.jetbrains.com/idea/download/#section=windows)
* [junit-jupiter:5.8.2](https://junit.org/junit5/docs/current/user-guide/)
* [GitHub Desktop](https://desktop.github.com)

