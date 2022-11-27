//00:34:04
function solution(input) {
  let arr = input.split('\n').map(Number);
  let sum = arr.reduce((acc, cur) => acc + cur * 1, 0);
  let faker = [];
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
      if (i !== j && sum - (arr[i] + arr[j]) === 100) {
        faker = [arr[i], arr[j]];
      }
    }
  }
  let answer = arr.filter(i => i !== faker[0] && i !== faker[1]);

  answer = answer.sort((a, b) => a - b);
  return answer.join('\n');
}

let input = `20
  7
  23
  19
  10
  15
  25
  8
  13`;

console.log(solution(input));
