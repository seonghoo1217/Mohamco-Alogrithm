//00:12:23
function solution(data) {
  let input = data.toString().trim().split('\n');
  const n = input[0];
  let set = new Set();
  for (let i = 1; i <= n; i++) {
    let check = input[i].split(' ');
    if (check[1] == 'enter') {
      set.add(check[0]);
    } else if (check[1] == 'leave') {
      set.delete(check[0]);
    }
  }
  let result = [...set].sort();
  result.reverse();
  return result.join('\n');
}

const case1 = `4
Baha enter
Askar enter
Baha leave
Artem enter`;

console.log(solution(case1));
