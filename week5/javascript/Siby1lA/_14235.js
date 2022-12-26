function heapify(arr) {
  // 주어진 배열을 heap 성질로 정렬
  if (arr.length <= 1) {
    return;
  }
  for (let i = Math.floor(arr.length / 2); i >= 0; i--) {
    max_heapify(arr, i, arr.length);
  }
}

function max_heapify(arr, i, length) {
  let left = i * 2 + 1;
  let right = i * 2 + 2;
  let parent = i;
  // 부모 노드와 왼, 오 노드의 값을 비교해 가장 큰 값을 부모 노드로 올려줌
  if (left < length && arr[left] > arr[parent]) {
    parent = left;
  }
  if (right < length && arr[right] > arr[parent]) {
    parent = right;
  }
  if (i != parent) {
    swap(arr, i, parent);
    max_heapify(arr, parent, length);
  }
}

function swap(arr, i, j) {
  [arr[i], arr[j]] = [arr[j], arr[i]];
}

function _insert(arr, data) {
  arr.push(data);
  let i = arr.length - 1;
  while (i > 0) {
    const parent = Math.floor((i - 1) / 2);
    if (arr[parent] > arr[i]) {
      // 추가한 노드 값이 부모 노드의 값보다 작을때 까지 반복
      break;
    }
    // 부모 노드가 더 작으면 위치 변경
    swap(arr, i, parent);
    i = parent;
  }
}

function _delete(arr) {
  //최댓값이 들어있는 root 노드와 최말단 노드의 자리를 바꿈
  swap(arr, 0, arr.length - 1);
  // 최말단으로 옮겨진 최댓값을 빼낸다. pop()
  const max = arr.pop();
  // root 노드에는 최말단 노드가 있기에 다시 재정렬
  heapify(arr);
  return max;
}

function solution(case1) {
  const input = case1.split("\n");
  const [N, ...a] = input;
  let box = [];
  for (let i = 0; i < Number(N); i++) {
    if (a[i] === "0") {
      if (box.length > 0) {
        const max = _delete(box);
        console.log(max);
      } else {
        console.log(-1);
      }
    } else {
      const [chargeCount, ...charge] = a[i].split(" ").map(Number);
      for (let j = 0; j < chargeCount; j++) {
        _insert(box, charge[j]);
      }
    }
  }
}

const case1 = `5
0
2 3 2
0
0
0`;

solution(case1);
