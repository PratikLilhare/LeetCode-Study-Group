class Solution:
    def subarrayLCM(self, nums: List[int], k: int) -> int:
        cnt = 0
        n = len(nums)
        
        def lcm(a,b):
            return (a*b)/gcd(int(a),int(b))
        
        for i in range(0,n):
            if nums[i] == k:
                cnt += 1
            res = nums[i]
            for j in range(i+1,n):
                res = lcm(res,nums[j])
                if res == k:
                    cnt += 1
                if res > k:
                    break
            
        return cnt
                
                
        
            
        
        

            
            