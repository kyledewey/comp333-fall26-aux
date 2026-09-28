// Immutable Linked Lists
// IList lst0 = new IList();      // lst0: []
// IList lst1 = lst0.prepend(1);  // lst1: [1]
//                                // lst0: []
// IList lst2 = lst1.prepend(2);  // lst2: [2, 1]
//                                // lst1: [1]
//                                // lst0: []
// IList lst3 = lst1.prepend(3);  // lst3: [3, 1]
//                                // lst2: [2, 1]
//                                // lst1: [1]
//                                // lst0: []
// IList lst4 = lst3.prepend(0);  // lst4: [0, 3, 1]
//                                // lst3: [3, 1]
//                                // lst2: [2, 1]
//                                // lst1: [1]
//                                // lst0: []


// class IList {
//   ...
//   public IList prepend(int value) { ... }
// }
//
// Mutable Linked Lists
// MList lst = new MList(); // []
// lst.prepend(1);          // [1]
// lst.prepend(2);          // [2, 1]
// lst.prepend(3);          // [3, 2, 1]
//
// class MList {
//   class Node {
//     public Node(int element, Node rest) {
//       this.element = element;
//       this.rest = rest;
//     }
//     int element;
//     Node rest;
//   }
//   Node head = null;
//   public void prepend(int value) {
//     head = new Node(value, head);
//   }
//
//   public boolean contains(int value) {
//     Node current = head;
//     while (current != null) {
//       if (current.element == value) {
//         return true;
//       } else {
//         current = current.rest;
//       }
//    }
//    return false;
//   }
// }
