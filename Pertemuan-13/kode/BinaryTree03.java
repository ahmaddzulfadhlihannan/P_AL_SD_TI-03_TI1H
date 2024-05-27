public class BinaryTree03 {
    Node03 root;

    public BinaryTree03(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data) {
        if(isEmpty()) {
            root = new Node03(data);
        } else {
            Node03 current = root;
            while(true) {
                if(data < current.data) {
                    if(current.left == null) {
                        current.left = new Node03(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if(data > current.data) {
                    if(current.right == null) {
                        current.right = new Node03(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        Node03 current = root;
        boolean result = false;
        while(current != null) {
            if(current.data == data) {
                result = true;
                break;
            }else if(data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node03 node) {
        if(node !=  null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }   
    }

    void traversePostOrder(Node03 node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node03 node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node03 getSuccessor(Node03 del) {
        Node03 successor = del.right;
        Node03 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if(isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node03 parent = root;
        Node03 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //Deletion
        if(current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child, simply delete it
            if(current.left == null && current.right == null) {
                if(current == root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null) { //if there is 1 child right
                if(current == root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null) { //if there is 1 child left
                if(current == root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //if there are 2 children
                Node03 successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // Tugas Praktikum
    // Method untuk menambahkan node secara rekursif
    public void recursive(Node03 current, int data) {
        if (data < current.data) {
            if (current.left != null) {
                recursive(current.left, data);
            } else {
                current.left = new Node03(data);
            }
        } else if (data > current.data) {
            if (current.right != null) {
                recursive(current.right, data);
            } else {
                current.right = new Node03(data);
            }
        }
    }

    // Method publik untuk memulai penambahan
    public void addRecursive(int value) {
        if (root == null) {
            root = new Node03(value);
        } else {
            recursive(root, value);
        }
    }

    // Method untuk menemukan nilai terkecil di dalam tree
    public int findMin() {
        Node03 current = root;
        if(current == null) {
            System.out.println("Tree is empty");
        }
        while(current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // Method untuk menemukan nilai terbesar di dalam tree
    public int findMax() {
        Node03 current = root;
        if(current == null) {
            System.out.println("Tree is empty");
        }
        while(current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // Method untuk menampilkan data yang ada di leaf
    public void printLeaf(Node03 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.println(node.data + " ");
        }
        printLeaf(node.left);
        printLeaf(node.right);
    }

    // Method untuk menghitung jumlah leaf di dalam tree
    public int hitungLeaf(Node03 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return hitungLeaf(node.left) + hitungLeaf(node.right);
    }

    
}
