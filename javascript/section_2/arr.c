#include "stdio.h"

// MONDAY: go over array access in C vs. Java

void print_element(int arr[], int index) {
  printf("%i\n", arr[index]);
}

int main() {
  int arr[3] = { 5, 6, 7 };
  print_element(arr, 5);
  return 0;
}
