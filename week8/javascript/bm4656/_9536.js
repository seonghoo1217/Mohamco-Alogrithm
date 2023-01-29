//00:30:36
function solution(data) {
  let [T, ...input] = data.toString().trim().split('\n');
  let answer = '';
  let arr = [];
  for (let i = 0; i < input.length; i++) {
    if (input[i] === 'what does the fox say?') {
      let [all, ...animals] = arr;
      // console.log(all, animals);
      let cry = [];
      all = all.split(' ');
      for (let i = 0; i < animals.length; i++) {
        cry.push(animals[i].split(' ')[2]);
      }
      all = all.filter(x => !cry.includes(x));
      // console.log(cry);
      answer = all.join(' ');
      arr = [];
      continue;
    } else arr.push(input[i]);
  }
  return answer;
}

const case1 = `1
toot woof wa ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot
dog goes woof
fish goes blub
elephant goes toot
seal goes ow
what does the fox say?`;

console.log(solution(case1));
