//00:10:04 + 00:39:08
function heapify(arr) {
  //최초 heap 구성
  // 주어진 배열을 heap 성질을 만족하도록 재정렬
  const length = arr.length;
  if (length <= 1) return;
  for (let i = Math.floor(length / 2); i >= 0; i--) {
    max_heapify(arr, i, length);
  }
}
function max_heapify(a, i, length) {
  let left = i * 2 + 1;
  let right = i * 2 + 2;
  let parent = i;

  if (left < length && a[left] > a[parent]) {
    parent = left;
  }

  if (right < length && a[right] > a[parent]) {
    parent = right;
  }

  if (i != parent) {
    swap(a, i, parent);
    console.log(a);
    max_heapify(a, parent, length);
  }
}
function swap(a, i, j) {
  let tmp = a[i];
  a[i] = a[j];
  a[j] = tmp;
}
function _insert(arr, data) {
  arr.push(data);
  let i = arr.length - 1;
  while (i > 0) {
    const parent = Math.floor((i - 1) / 2);
    if (arr[parent] > arr[i]) break;

    swap(arr, i, parent);
    i = parent;
  }
  return arr;
}
function _delete(arr) {
  swap(arr, 0, arr.length - 1);
  const max = arr.pop();
  heapify(arr);
  return max;
}

function solution(data) {
  let input = data.toString().trim().split('\n');
  const n = input[0];
  let gifts = [];
  let result = [];
  for (let i = 1; i <= n; i++) {
    if (input[i] == 0) {
      if (gifts.length == 0) {
        result.push(-1);
      } else {
        const max = _delete(gifts);
        result.push(max);
      }
    } else {
      const [count, ...charge] = input[i].split(' ');
      for (let j = 0; j < count; j++) {
        _insert(gifts, charge[j]);
      }
    }
  }
  return result.join('\n');
}

const case1 = `5
0
2 3 2
0
0
0`;

console.log(solution(case1));
