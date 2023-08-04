# BiggestBinaryGap

This is a Java program that finds the biggest binary gap of a given decimal number. A binary gap is the maximum sequence of consecutive zeros in the binary representation of a number.

## How to Use

1. Clone the repository to your local machine.
2. Compile the `BiggestBinaryGap.java` file using a Java compiler:
   ```
   javac BiggestBinaryGap.java
   ```
3. Run the compiled Java program:
   ```
   java BiggestBinaryGap
   ```
4. Enter a decimal number when prompted to find its biggest binary gap.

## Input

The program will ask you to enter a decimal number for which you want to find the biggest binary gap.

## Output

After providing the decimal number, the program will display the binary representation of the number and the biggest binary gap found in that binary representation.

## Algorithm

The program follows the following steps to find the biggest binary gap:

1. Read the decimal number input from the user.
2. Convert the decimal number to its binary representation.
3. Iterate through the binary string and count the consecutive zeros (binary gap).
4. Keep track of the biggest gap found during the iteration.
5. Display the biggest binary gap.

## Example

Let's consider an example:

```
Please, enter a decimal number to find its biggest binary gap
25
```

Output:

```
Your number is: 25 which is: 11001 in binary
The biggest binary gap is: 2
```

In this example, the binary representation of the decimal number 25 is `11001`, and the biggest binary gap is `2`.

## Note

- The program only considers the binary gaps surrounded by ones. If the binary representation starts or ends with zeros, those will not be counted as binary gaps.

Feel free to use and modify the code according to your needs. If you encounter any issues or have any suggestions for improvement, please create an issue or pull request on the repository. Happy coding!
