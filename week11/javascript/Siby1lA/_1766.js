//00:50:12
function solution(case1) {
  const input = case1.split("\n");
  const [n, m] = input.shift().split(" ").map(Number);
  const a = input.map((v) => v.split(" ").map(Number));
  const b = new Array(n + 1).fill(null).map(() => []);
  const inDegree = new Array(n + 1).fill(0);

  for (let i = 0; i < m; i++) {
    b[a[i][0]].push(a[i][1]);
    inDegree[a[i][1]]++;
  }

  class MinHeap {
    constructor() {
      this.heap = [];
    }

    getLeftChild(x) {
      return 2 * x + 1;
    }

    getRightChild(x) {
      return 2 * x + 2;
    }

    getParent(x) {
      return Math.floor((x - 1) / 2);
    }

    add(data) {
      this.heap.push(data);
      this.heapifyUp();
    }

    heapifyUp() {
      let current = this.heap.length - 1;
      const lastInsertedNode = this.heap[current];

      while (current > 0) {
        const parentIndex = this.getParent(current);

        if (this.heap[parentIndex] > lastInsertedNode) {
          this.heap[current] = this.heap[parentIndex];
          current = parentIndex;
        } else break;
      }

      this.heap[current] = lastInsertedNode;
    }

    pop() {
      const count = this.heap.length;
      const rootNode = this.heap[0];

      if (count <= 0) {
        return 0;
      }
      if (count === 1) this.heap = [];
      else {
        this.heap[0] = this.heap.pop();
        this.heapifyDown();
      }

      return rootNode;
    }

    heapifyDown() {
      let current = 0;
      const count = this.heap.length;
      const rootNode = this.heap[current];

      while (this.getLeftChild(current) < count) {
        const leftChild = this.getLeftChild(current);
        const rightChild = this.getRightChild(current);

        const smallerChild =
          rightChild < count && this.heap[rightChild] < this.heap[leftChild]
            ? rightChild
            : leftChild;

        if (this.heap[smallerChild] <= rootNode) {
          this.heap[current] = this.heap[smallerChild];
          current = smallerChild;
        } else break;
      }

      this.heap[current] = rootNode;
    }
  }

  const queue = new MinHeap();

  for (let i = 1; i <= n; i++) {
    if (inDegree[i] === 0) {
      queue.add(i);
    }
  }

  const result = [];

  while (queue.heap.length > 0) {
    const node = queue.pop();
    result.push(node);
    const nexts = b[node];
    for (let i = 0; i < nexts.length; i++) {
      if (--inDegree[nexts[i]] === 0) {
        queue.add(nexts[i]);
      }
    }
  }

  return result.join(" ");
}

const case1 = `4 2
4 2
3 1`;

console.log(solution(case1));
