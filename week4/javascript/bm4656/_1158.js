//00:28:44
function solution(data) {
  let input = data.toString().trim().split(' ').map(Number);
  const [n, k] = input;
  const queue = [];
  const result = [];
  for (let i = 0; i < n; i++) {
    queue.push(i + 1);
  }
  let count = 1;
  while (queue.length) {
    const shiftItem = queue.shift();
    if (count % k === 0) {
      result.push(shiftItem);
    } else {
      queue.push(shiftItem);
    }
    count++;
  }
  return '<' + result.join(', ') + '>';
}

const case1 = `7 3`;

console.log(solution(case1));
