#include "stdio.h"

void print_element(int arr[], int index) {
  int element = arr[index];
  printf("%i\n", element);
}

int main() {
  int arr[1000];
  printf("hi\n");
  print_element(arr, 99);
  //printf("%lu\n", sizeof(int));
  return 0;
}
